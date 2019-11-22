import { BrowserModule } from '@angular/platform-browser';
import { NgModule } from '@angular/core';
import { NoopAnimationsModule } from '@angular/platform-browser/animations';
import { MatInputModule } from '@angular/material/input';
import { MatButtonModule } from '@angular/material/button';
import { MatRadioModule } from '@angular/material/radio';
import {MatFormFieldModule} from '@angular/material/form-field';

import { AppRoutingModule } from './app-routing.module';
import { AppComponent } from './app.component';
import { PantallaPrincipalComponent } from './componentes/pantalla-principal/pantalla-principal.component';
import { IniciarSesionComponent } from './componentes/iniciar-sesion/iniciar-sesion.component';
import { TiposDePublicacionComponent } from './componentes/tipos-de-publicacion/tipos-de-publicacion.component';
import { CrearPubicacionComponent } from './componentes/crear-pubicacion/crear-pubicacion.component';
import { VistaPreviaComponent } from './componentes/vista-previa/vista-previa.component';
import { PublicacionFinalComponent } from './componentes/publicacion-final/publicacion-final.component';
import { NotFoundComponent } from './componentes/not-found/not-found.component';
import { FormsModule } from '@angular/forms';
import { HttpClientModule } from '@angular/common/http';
import { RestClientService } from './servicios/rest-client.service';
import { PerfilPropioComponent } from './componentes/perfil-propio/perfil-propio.component';
import { PerfilPropioChatsComponent } from './componentes/perfil-propio-chats/perfil-propio-chats.component';
import { PerfilPropioPublicacionesComponent } from './componentes/perfil-propio-publicaciones/perfil-propio-publicaciones.component';
import { PerfilEntidadComponent } from './componentes/perfil-entidad/perfil-entidad.component';
import { BusquedaServiciosAvanzadoComponent } from './componentes/busqueda-servicios-avanzado/busqueda-servicios-avanzado.component';
import { PerfilPropioPublicacionesVacioComponent } from './componentes/perfil-propio-publicaciones-vacio/perfil-propio-publicaciones-vacio.component';
import { ResultadosServiciosComponent } from './componentes/resultados-servicios/resultados-servicios.component';
import { BusquedaServiciosBasicoComponent } from './componentes/busqueda-servicios-basico/busqueda-servicios-basico.component';
import { BuscarServicioComponent } from './componentes/buscar-servicio/buscar-servicio.component';


@NgModule({
  declarations: [
    AppComponent,
    PantallaPrincipalComponent,
    IniciarSesionComponent,
    TiposDePublicacionComponent,
    CrearPubicacionComponent,
    VistaPreviaComponent,
    PublicacionFinalComponent,
    NotFoundComponent,
    PerfilPropioComponent,
    PerfilPropioChatsComponent,
    PerfilPropioPublicacionesComponent,
    PerfilEntidadComponent,
    BusquedaServiciosAvanzadoComponent,
    PerfilPropioPublicacionesVacioComponent,
    ResultadosServiciosComponent,
    BusquedaServiciosBasicoComponent,
    BuscarServicioComponent
  ],
  imports: [
    BrowserModule,
    AppRoutingModule,
    FormsModule,
    HttpClientModule,
    NoopAnimationsModule,
    MatInputModule,
    MatButtonModule,
    MatRadioModule,
    MatFormFieldModule
  ],
  providers: [RestClientService],
  bootstrap: [AppComponent]
})
export class AppModule { }
