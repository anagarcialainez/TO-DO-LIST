const tasksSection = document.querySelector("#tasks-section");

function addTasks(tasks) {
    tasksSection.innerHTML = "";
    tasks.forEach((task, position) => {
        const htmlElement = document.createElement("div");
        htmlElement.innerHTML = `<div class="task">
            <div 
                class="close-button" 
                onclick="fetch(\`/tasks/${position}\`, { method: 'DELETE'}).then(reloadTasks)">x</div>
            <p class="title">${task.title}</p>
        </div>`;
        tasksSection.appendChild(htmlElement)
    })
}

let reloadTasks = () => {
    fetch("/tasks")
        .then(r => r.json())
        .then(addTasks)
};

document.addEventListener("DOMContentLoaded", reloadTasks)






