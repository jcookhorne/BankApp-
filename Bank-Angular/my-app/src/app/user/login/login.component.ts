import { Component, OnInit } from '@angular/core';

@Component({
  selector: 'app-login',
  templateUrl: './login.component.html',
  styleUrls: ['./login.component.scss']
})
export class LoginComponent implements OnInit {
  toggleLogin: boolean = true;
  title: string = "Welcome to Trace of Trinit's Online Banking";

  toggleMainLogin(){
    if(this.toggleLogin){
      this.toggleLogin = false;
    }else{
      this.toggleLogin = true;
    }
  }
  constructor() { }

  ngOnInit(): void {
  }

}
