const tasksSection = document.querySelector("#tasks-section");

function addTasks(tasks) {
    tasksSection.innerHTML = "";
    tasks.forEach((task, position) => {
        const htmlElement = document.createElement("div");
        htmlElement.innerHTML = `<div class="task">
            <div 
                class="close-button" 
                onclick="fetch(\`/TodoList/${position}\`, { method: 'DELETE'}).then(reloadTasks)"></div>
            <p class="title">${task.task}</p>
        </div>`;
        tasksSection.appendChild(htmlElement)
    })
}

let reloadTasks = () => {
    fetch("/TodoList")
        .then(r => r.json())
        .then(addTasks)
};

document.addEventListener("DOMContentLoaded", reloadTasks)
const icon = document.getElementById("iconrefresh");
icon.addEventListener("click", reloadTasks)




