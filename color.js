const colors = [
    "#FF5733", "#33FF57", "#5733FF", "#F39C12", "#8E44AD",
    "#E74C3C", "#2ECC71", "#1ABC9C", "#D35400", "#C0392B"
];

const shapes = ["square", "circle", "rectangle", "triangle", "diamond", "star", "heart"];

let shapeHistory = [];
let colorHistory = [];

document.getElementById("changeColor").addEventListener("click", function () {
    let randomColor = colors[Math.floor(Math.random() * colors.length)];
    shapeHistory.push(document.getElementById("shape-box").className);
    colorHistory.push(document.getElementById("shape-box").style.background);

    document.getElementById("shape-box").style.background = randomColor;
    document.getElementById("clickSound").play();
});

document.getElementById("changeShape").addEventListener("click", function () {
    let shapeBox = document.getElementById("shape-box");
    shapeHistory.push(shapeBox.className);
    colorHistory.push(shapeBox.style.background);

    shapeBox.className = "";
    let randomShape = shapes[Math.floor(Math.random() * shapes.length)];
    shapeBox.classList.add(randomShape);
    document.getElementById("clickSound").play();
});

document.getElementById("revert").addEventListener("click", function () {
    if (shapeHistory.length > 0) {
        document.getElementById("shape-box").className = shapeHistory.pop();
        document.getElementById("shape-box").style.background = colorHistory.pop();
        document.getElementById("clickSound").play();
    }
});
