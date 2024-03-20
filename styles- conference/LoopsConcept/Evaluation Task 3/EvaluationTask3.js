class Student{
	constructor(name,email,gender,stream,phone){
		this.name=name;
		this.email=email;
		this.gender=gender;
		this.stream=stream;
		this.phone=phone;
	}
}

class Department extends Student{
	constructor(name,email,gender,department){
		super(name,email,gender);
		this.department=department;
	}
}
class DataOutput{
	constructor() {
        this.departmentObject = {
            'I.T': { students: [], noofmale: 0, nooffemale: 0 },
            CSC: { students: [], noofmale: 0, nooffemale: 0 },
            'Bio.Tech': { students: [], noofmale: 0, nooffemale: 0 },
            'Bio.Chemical': { students: [], noofmale: 0, nooffemale: 0 }
        };
    }		
	isStudentEligible(student) {
        let preferredDepartment = student.department;
        if (student.gender === 'Male') {
            return this.departmentObject[preferredDepartment].noofmale < 6;
        } else if(student.gender === 'Female') {
            return this.departmentObject[preferredDepartment].nooffemale < 4;
        }
    }
	admitStudent(student) {
        if (this.isStudentEligible(student)) {
            let preferredDepartment = student.department;
            if (student.gender === 'Male') {
                this.departmentObject[preferredDepartment].noofmale++;
            } else if(student.gender === 'Female') {
                this.departmentObject[preferredDepartment].nooffemale++;
            }
            this.departmentObject[preferredDepartment].students.push(student);
            admissionData.push(student);
        } else {
            alert('Student cannot be admitted. Department capacity reached.');
        }
    }
}


function openRegisterForm(){
	document.querySelector(".registerForm").style.display="block";
	document.querySelector(".admissionForm").style.display="none";
	document.querySelector(".dataTable").style.display="none";
}
function openAdmissionForm(){
	document.querySelector(".registerForm").style.display="none";
	document.querySelector(".dataTable").style.display="none";
	document.querySelector(".admissionForm").style.display="block";
}
function openDataTable(){
	document.querySelector(".registerForm").style.display="none";
	document.querySelector(".admissionForm").style.display="none";
	document.querySelector(".dataTable").style.display="block";
	filterData();
}


function checkGender(){
	var gender=document.getElementById("Gender").value;
	if(gender=="Female"){
		document.getElementById("Phone").disabled=true;
	}
}

var regData=[];
function registerForm(){

	var name=document.getElementById("Name").value;
	var email=document.getElementById("Email").value;
	var gender=document.getElementById("Gender").value;
	var stream=document.getElementById("Stream").value;
	var phone=document.getElementById("Phone").value;
	
	var tempData;
	
	tempData=new Student(name,email,gender,stream,phone);
	regData.push(tempData);
	clearForm1();
	event.preventDefault();
}

var name;

function checkRegistration(){
	name=document.getElementById("AName").value;
    const filteredStudent = regData.filter(student => student.name === name);
    if (filteredStudent.length > 0) {
			document.getElementById("AEmail").value=filteredStudent[0].email;
			document.getElementById("AGender").value=filteredStudent[0].gender;
		}else{
			alert("Please Register the Student Data in Register form");
			openRegisterForm();
		}
}



var admissionData=[];
function admissionForm(){
	  const filteredStudents = regData.filter(student => student.name === name);
	  
	var email=filteredStudents[0].email;
	var gender=filteredStudents[0].gender;
	var department=document.getElementById("Department").value;

	var student=new Department(name,email,gender,department);
	var instance=new DataOutput();
	instance.admitStudent(student)
	clearForm1();
	event.preventDefault();
}

function filterData(){
	document.getElementById("tbodyData").innerHTML = "";
	var gender = document.getElementById("genderFilter").value;
	var department = document.getElementById("DepartmentFilter").value;

	for(i=0;i<admissionData.length;i++){
		if((gender=="All" || admissionData[i].gender==gender )&&(department=="All" || admissionData[i].department==department)){
			 let newRow = document.createElement("tr");
			 newRow.innerHTML =`<td>${admissionData[i].name}</td><td>${admissionData[i].email}</td><td>${admissionData[i].gender}</td><td>${admissionData[i].department}</td>`;
			 
			 document.getElementById("tbodyData").appendChild(newRow);
		}
	}
}


function clearForm1(){
	document.getElementById("Name").value="";
	document.getElementById("Email").value="";
	document.getElementById("Gender").value="";
	document.getElementById("Stream").value="";
	document.getElementById("Phone").value=""
	
	document.getElementById("AName").value="";
	document.getElementById("AEmail").value="";
	document.getElementById("AGender").value="";
	document.getElementById("Department").value="";
}

