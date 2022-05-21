import { Component, OnInit } from '@angular/core';

@Component({
  selector: 'app-navigation',
  templateUrl: './navigation.component.html',
  styleUrls: ['./navigation.component.scss']
})
export class NavigationComponent implements OnInit {
  toggleLogin: boolean = true;
  title: string = "Expense Reimbursement System";
  role: string = "Employee"
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
