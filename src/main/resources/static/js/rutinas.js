
//Funcion para acomodar el grid de la pagina
window.onload = function () {
  const container = document.getElementById("grid-container");
  const columns = document.getElementsByClassName("grid-item");

  container.style.display = "grid";
  container.style.gridTemplateColumns = "repeat(auto-fit, minmax(200px, 1fr))";
  
  for (let i = 0; i < columns.length; i++) {
    columns[i].style.margin = "10px";
  }
};


// Intento de hacer un cronometro para el tiempo de respuesta
let isRunning = false;
let startTime;
let interval;

windot.onload = function() {
  if (isRunning) {
    // Detener el cronómetro
    clearInterval(interval);
    isRunning = false;
    document.getElementById("startStop").textContent = "Iniciar";
  } else {
    // Iniciar o reanudar el cronómetro
    startTime = Date.now() - (startTime || 0);
    interval = setInterval(updateDisplay, 10);
    isRunning = true;
    document.getElementById("startStop").textContent = "Detener";
  }
}

function reset() {
  clearInterval(interval);
  isRunning = false;
  startTime = null;
  updateDisplay();
  document.getElementById("startStop").textContent = "Iniciar";
}

function updateDisplay() {
  const currentTime = Date.now() - startTime;
  const minutes = Math.floor(currentTime / 60000);
  const seconds = Math.floor((currentTime % 60000) / 1000);
  const milliseconds = Math.floor((currentTime % 1000) / 10);
  document.getElementById("display").textContent = `${formatTime(minutes)}:${formatTime(seconds)}:${formatTime(milliseconds)}`;
}

function formatTime(time) {
  return time.toString().padStart(2, "0");
}