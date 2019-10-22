import { BrowserModule } from '@angular/platform-browser';
import { NgModule } from '@angular/core';

import { AppRoutingModule } from './app-routing.module';
import { AppComponent } from './app.component';
import { PantallaPrincipalComponent } from './componentes/pantalla-principal/pantalla-principal.component';
import { IniciarSesionComponent } from './componentes/iniciar-sesion/iniciar-sesion.component';
import { TiposDePublicacionComponent } from './componentes/tipos-de-publicacion/tipos-de-publicacion.component';
import { CrearPubicacionComponent } from './componentes/crear-pubicacion/crear-pubicacion.component';
import { VistaPreviaComponent } from './componentes/vista-previa/vista-previa.component';
import { PublicacionFinalComponent } from './componentes/publicacion-final/publicacion-final.component';
import { NotFoundComponent } from './componentes/not-found/not-found.component';
import {FormsModule} from '@angular/forms';
import { HttpClientModule } from '@angular/common/http';
import { RestClientService } from './servicios/rest-client.service';
@NgModule({
  declarations: [
    AppComponent,
    PantallaPrincipalComponent,
    IniciarSesionComponent,
    TiposDePublicacionComponent,
    CrearPubicacionComponent,
    VistaPreviaComponent,
    PublicacionFinalComponent,
    NotFoundComponent
  ],
  imports: [
    BrowserModule,
    AppRoutingModule,
    FormsModule,
    HttpClientModule
  ],
  providers: [RestClientService],
  bootstrap: [AppComponent]
})
export class AppModule { }
