// function to alert string wenn valide

function checkFormValidity(){
    // Variablenzuweisung
    let form = document.getElementById("seminarForm");
    // Funktion, die die Forminputs validiert
    let isValid = form.checkValidity();

    // Boolean wert der Funktion überprüft ob alle Daten valide sind
    if(!isValid){
        alert("Bitte fülle alle Felder aus");
    }
    else{
        alert("Wir haben deine Nachricht erhalten.");
    }
}