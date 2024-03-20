class Phone{
    constructor(phoneNumber){
        this.phoneNumber=phoneNumber;
    }

    call(receiver_number){
       
    }
    message(receiver_number,message){
     
    }
}
class Basic extends Phone{
    constructor(phoneNumber){
        super(phoneNumber);
    }
}
class Smartphone extends Phone{
    constructor(phoneNumber,emailId){
        super(phoneNumber);
        this.emailId=emailId;
    }

    email(to_emailId,subject,body){
       
    }
}
class Single extends Basic{
    constructor(phoneNumber){
        super(phoneNumber);
    }
}

class Dual extends Basic{
    constructor(phoneNumber,phone1Number,phone2Number){
        super(phoneNumber);
        this.phone1Number=phone1Number;
        this.phone2Number=phone2Number;
    }

    call(receiver_number,simNumber){
        if(simNumber==="One"){
			this.phone1Number;
        }else{
			this.phone2Number;
			
		}
    }
	message(receiver_number,simNumber,message){
		if(simNumber==="One"){

        }else{
			
		}
    }
}
class IOS extends Smartphone{
    constructor(phoneNumber,emailId,facetimeid){
        super(phoneNumber,emailId);
        this.facetimeid=facetimeid;
    }

    facetime(to_facetimeid){
        
    }
}
class Android extends Smartphone{
    constructor(phoneNumber,emailId,duoid){
        super(phoneNumber,emailId);
        this.duoid=duoid;
    }

    duo(to_duoid){
        
    }
}
class WindowsPhone extends Smartphone{
    constructor(phoneNumber,emailId,skypeid){
        super(phoneNumber,emailId);
        this.skypeid=skypeid;
    }

    skype(to_skypeid){
       
    }
}

var instance;

