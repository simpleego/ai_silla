<script>
    export let todoList;


    let deleteTodo = (id) => {
		const index = todoList.findIndex((todo) => todo.id === id);
		if (todoList[index]["completed"]) {
			todoList = todoList.filter((todo) => todo.id !== id);
		} else {
			alert("아직 완료하지 않은 업무입니다.");
		}
	};

    let handleComplete = (id) => {
		const index = todoList.findIndex((todo) => todo.id === id);
		todoList[index]["completed"] = !todoList[index]["completed"];
	}
</script>

<main>
    {#each todoList as todo}
        <!-- <TodoItem {todo}/> -->
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
    {/each}
</main>

<link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/4.7.0/css/font-awesome.min.css">
<style>
    p {
		display: inline-block;
	}
</style>
