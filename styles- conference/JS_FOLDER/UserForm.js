function firstName() {
  var fname = document.getElementById("fname").value;
  if (fname.trim() === "") {
    document.getElementById("fnameError").innerHTML = "enter the first name";
  }
}
function firstNameErrorHide() {
  document.getElementById("fnameError").innerHTML = "";
}

window.dataArray = [];
function submitData() {
	document.querySelector(".filterset").style.display="block";
	document.querySelector(".formbox").style.marginTop="75px";
  var fname = document.getElementById("fname").value;
  var lname = document.getElementById("lname").value;
  var gender = document.getElementById("gender").value;
  var phone = document.getElementById("phone").value;
  var email = document.getElementById("Email").value;

  var objValue={firstName:fname,lastName:lname,genderType:gender,mobilePhone:phone,mailAddress:email};

  dataArray.push(objValue);
  filterGender();
  clearInputs();

  return false;
}

function clearInputs() {
  document.getElementById("fname").value = "";
  document.getElementById("lname").value = "";
  document.getElementById("gender").value="Select";
  document.getElementById("phone").value = "";
  document.getElementById("Email").value = "";
}

function filterGender() {
  document.getElementById("tbodyData").innerHTML = "";
  var filter = document.getElementById("genderFilter").value;

  for (i = 0; i < dataArray.length; i++) {
    if (filter === "All" || dataArray[i].genderType === filter) {
      let newRow = document.createElement("tr");
      newRow.innerHTML = `<td>${dataArray[i].firstName}</td><td>${data
	  Array[i].lastName}</td><td>${dataArray[i].genderType}</td><td>${dataArray[i].mobilePhone}</td><td>${dataArray[i].mailAddress}</td>`;
	  
      document.getElementById("tbodyData").appendChild(newRow);
    }
  }
}
