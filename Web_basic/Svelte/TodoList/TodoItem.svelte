<script>
    export let todo;
    export let deleteTodo;
    export let handleComplete;
</script>

<main>
    <div>
        <p>{todo.id}: {todo.title}</p>
        <input
            type="checkbox"
            checked={todo.completed}
            on:change={() => handleComplete(todo.id)}
        />
        <button>
            <i class="fa fa-edit"></i>
        </button>
        <button on:click={() => deleteTodo(todo.id)}>
            <i class="fa fa-trash-o"></i>
        </button>
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
