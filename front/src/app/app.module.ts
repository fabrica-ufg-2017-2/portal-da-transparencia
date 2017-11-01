import { BrowserModule } from '@angular/platform-browser';
import { NgModule } from '@angular/core';
import { HttpClientModule } from '@angular/common/http';

import { AppComponent } from './app.component';

import { HomeComponent } from './shared/screens/home/home.component';
import { NotFoundComponent } from './shared/screens/not-found/not-found.component';

import { HeaderComponent } from './shared/components/header/header.component';
import { FooterComponent } from './shared/components/footer/footer.component';
import { EnsinoModule } from './ensino/ensino.module';
import { ExtensaoModule } from './extensao/extensao.module';
import { GestaoModule } from './gestao/gestao.module';
import { PesquisaModule } from './pesquisa/pesquisa.module';
import { AppRoutingModule } from './app-routing.module';

@NgModule({
  declarations: [
    AppComponent,
    HomeComponent,
    NotFoundComponent,
    HeaderComponent,
    FooterComponent
  ],
  imports: [BrowserModule, HttpClientModule, AppRoutingModule],
  providers: [],
  bootstrap: [AppComponent]
})
export class AppModule {}
