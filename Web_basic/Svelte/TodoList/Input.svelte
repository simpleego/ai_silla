<script>
    export let title;
    export let addTodo;
    export let handleKeyUp;
</script>


<main>
    <input	type="text"
    placeholder="할일을 입력하쇼"
    bind:value={title}
    on:keyup={(e) => handleKeyUp(e)}
        />
 <button on:click={addTodo}>ADD</button>

</main>

<style>

</style>