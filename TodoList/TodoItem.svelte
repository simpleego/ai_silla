<script>
    export let todo;
    export let todoList;
    export let deleteTodo;    
    export let handleComplete;

    let isEdit = false;
    let title = '';
    
    function onEdit(){
        isEdit = true;
        title = todo.title;
    }

    let offEdit=(()=>{
        isEdit = false;
        todoList = todoList;
        console.log('todo.title :'+todo.title )
    });

    let updateTodo=(()=>{
        todo.title = title;
        todoList = todoList;
        offEdit();
    });

</script>

<main>
    <div>
        {#if isEdit}
          <input type="text" bind:value={title}
                    on:keydown={(e)=>{e.key == 'Enter' && updateTodo()}}/>
          <button on:click={updateTodo}>Ok</button>
          <button on:click={offEdit}>Cancel</button>
        {:else}
            <p>{todo.id}: {todo.title}</p>
            <input
                type="checkbox"
                checked={todo.completed}
                on:change={handleComplete(todo.id)}
            />
            <button on:click={onEdit}>
                <i class="fa fa-edit"></i>
            </button>
            <button on:click={deleteTodo(todo.id)}>
                <i class="fa fa-trash-o"></i>
            </button>
        {/if}
    </div>
</main>

<link
    rel="stylesheet"
    href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/4.7.0/css/font-awesome.min.css"
/>

<style>
    p {
        display: inline-block;
    }
</style>