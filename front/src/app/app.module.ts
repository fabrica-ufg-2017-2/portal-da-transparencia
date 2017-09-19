import { BrowserModule } from '@angular/platform-browser';
import { NgModule } from '@angular/core';

import { AppComponent } from './app.component';

import { HomeComponent } from './shared/home/home.component';
import { NotFoundComponent } from './shared/not-found/not-found.component';

import { HeaderModule } from './shared/header/header.module';
import { FooterModule } from './shared/footer/footer.module';
import { EnsinoModule } from './ensino/ensino.module';
import { ExtensaoModule } from './extensao/extensao.module';
import { GestaoModule } from './gestao/gestao.module';
import { PesquisaModule } from './pesquisa/pesquisa.module';
import { AppRoutingModule } from './app-routing.module';

@NgModule({
  declarations: [
    AppComponent,
    HomeComponent,
    NotFoundComponent
  ],
  imports: [
    BrowserModule,
    HeaderModule,
    FooterModule,
    EnsinoModule,
    ExtensaoModule,
    GestaoModule,
    PesquisaModule,
    AppRoutingModule
  ],
  providers: [],
  bootstrap: [AppComponent]
})
export class AppModule { }
