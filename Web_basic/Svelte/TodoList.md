# 스벨트를 이용한 Todo List 프로그램
## 1. 프로젝트  생성

> todo list프로젝트를 위한 작업을 준비한다. 
```command
1. npx degit sveltejs/template TodoList
2. cd SvelteEx
3. npm install
4. npm run dev
```
> npx를 이용하여 스벨트 프로젝트의 기본적인 폴더 및 파일을 생성한다.
> 프로젝트 폴더명은 "TodoList"로 설정하였다.
> 생성된 프로젝트 폴더 "TodoList"로 이동한다.
> npm install로 node 모듈을 설치한다.
> npm run dev로 node 서버를 개발자 환경모드로 실행한다.
## Todo List 기본구조

![image](https://github.com/user-attachments/assets/bfdf8c3a-c25f-4c96-8e15-a4dcad107d3f)

- # 폴더 구조
- public, src, scripts, node_modules
- 1. App.svelte (메인앱)
- 2. TodoItem.svelte (개별 할 일 아이템)
 
### App.svelte
```svelte
<script>
  import TodoItem from './TodoItem.svelte';
 
  let todos = [
    { id: 1, text: 'Learn Svelte', completed: false },
    { id: 2, text: 'Build a To-Do App', completed: false },
    { id: 3, text: 'Deploy to Production', completed: false },
  ];
 
  let newTodo = '';
 
  function addTodo() {
    if (newTodo.trim()) {
      todos = [
        ...todos,
        { id: todos.length + 1, text: newTodo, completed: false },
      ];
      newTodo = '';
    }
  }
 
  function deleteTodo(event) {
    todos = todos.filter(todo => todo.id !== event.detail); // event.detail에 ID가 있음
  }
 
  function toggleComplete(event) {
    todos = todos.map(todo =>
      todo.id === event.detail ? { ...todo, completed: !todo.completed } : todo
    );
  }
</script>
 
<main>
  <h1>To-Do List</h1>
 
  <input
    type="text"
    placeholder="Add a new task"
    bind:value={newTodo}
    on:keypress={(e) => e.key === 'Enter' && addTodo()}
  />
  <button on:click={addTodo}>Add</button>
 
  <ul>
    {#each todos as todo}
      <TodoItem
        {todo}
        on:delete={deleteTodo}
        on:toggle={toggleComplete}
      />
    {/each}
  </ul>
</main>
 
<style>
  main {
    width: 400px;
    margin: 50px auto;
    font-family: Arial, sans-serif;
    text-align: center;
  }
 
  input {
    padding: 8px;
    width: 70%;
    font-size: 16px;
  }
 
  button {
    padding: 8px 15px;
    margin-left: 5px;
    font-size: 16px;
  }
 
  ul {
    list-style: none;
    padding: 0;
    margin-top: 20px;
  }
</style>
```
## To-Do 리스트의 메인 컴포넌트로, 전체 애플리케이션의 상태와 UI를 관리합니다.

- todos 배열: 각 To-Do 항목(id, text, completed 속성 포함)을 저장.
- newTodo 변수: 입력 필드의 값과 바인딩.
- addTodo(): 새로운 To-Do 항목을 추가.
- deleteTodo(event): 특정 항목을 삭제.
- toggleComplete(event): 특정 항목의 완료 상태를 반전.
-UI 구성
 -입력 필드와 버튼을 통해 To-Do 추가.
 -To-Do 목록을 렌더링하며 각 항목은 TodoItem 컴포넌트를 사용.
 -To-Do 항목 삭제 및 완료 상태 토글은 컴포넌트에서 발생한 이벤트로 처리.
