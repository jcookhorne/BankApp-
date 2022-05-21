export interface Account{
    accountId:number;
    accountName:String;
    accountBalance:number;
    // So customer Id is actually linked to the Customer Entity
    // so that means that I may have to change that to reference the model
    customerId: number;
    accountUsername: String;
    accountPassword: String;
}