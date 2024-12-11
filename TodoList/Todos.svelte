<script>
    import TodoItem from './TodoItem.svelte'
    export let todoList;

    let isEdit = false;
    let title = ''    

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
        <div>
            <TodoItem {todo} {todoList} {deleteTodo} {handleComplete}/>            
        </div>
    {/each}
</main>


<style>
   
</style>