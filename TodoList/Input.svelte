<script>
    export let title;
    export let addTodo;
    export let handleKeyUp;
</script>

<main>  
    <div id="insertItem"> 
        <div><h1 id=title>To Do List</h1></div>
        <div>
            <input	size=60 type="text"
            placeholder="할일을 입력하쇼"
            bind:value={title}
            on:keyup={(e) => handleKeyUp(e)}
                />
            <button on:click={addTodo}>ADD</button>
        </div>
    </div> 
</main>

<style>
    main {
        width: 800px;
    }
    #insertItem {        
        width: 800px;        
        margin: 0px auto;
        position: fixed;
        box-sizing: border-box;
        padding: 10px;
        display: flexbox;
        top: 0px;
        left: 0px;
        right: 0px;
        background-color: MediumTurquoise;
        text-align: center;
        padding-bottom: 30px;
    }

    #title {
        text-align: center;
    }

    input {
        size: 100px;
    }

</style>