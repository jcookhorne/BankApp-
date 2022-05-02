import { NgModule } from '@angular/core';
import { BrowserModule } from '@angular/platform-browser';

import { AppRoutingModule } from './app-routing.module';
import { AppComponent } from './app.component';
import { AdminComponent } from './admin/admin.component';
import { InfoComponent } from './admin/info/info.component';
import { CustomerComponent } from './customer/customer.component';
import { AccountComponent } from './customer/account/account.component';
import { HistoryComponent } from './customer/history/history.component';

@NgModule({
  declarations: [
    AppComponent,
    AdminComponent,
    InfoComponent,
    CustomerComponent,
    AccountComponent,
    HistoryComponent
  ],
  imports: [
    BrowserModule,
    AppRoutingModule
  ],
  providers: [],
  bootstrap: [AppComponent]
})
export class AppModule { }
