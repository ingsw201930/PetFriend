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
import { RegistroComponent } from './componentes/registro/registro.component';
import { RegistrarUsuarioComponent } from './componentes/registrar-usuario/registrar-usuario.component';
import { RegistrarEntidadComponent } from './componentes/registrar-entidad/registrar-entidad.component';
import { AnimalesSimilaresComponent } from './componentes/animales-similares/animales-similares.component';
import { AnimalesComponent } from './componentes/animales/animales.component';
import { ResultadosBusquedaComponent } from './componentes/resultados-busqueda/resultados-busqueda.component';
import { AdoptaBasicoComponent } from './componentes/adopta-basico/adopta-basico.component';
import { ResultadosAdoptaComponent } from './componentes/resultados-adopta/resultados-adopta.component';
import { AdoptaAvanzadoComponent } from './componentes/adopta-avanzado/adopta-avanzado.component';
import { EncontrarBasicoComponent } from './componentes/encontrar-basico/encontrar-basico.component';
import { EncontrarAvanzadoComponent } from './componentes/encontrar-avanzado/encontrar-avanzado.component';
import { ResultadosEncontrarComponent } from './componentes/resultados-encontrar/resultados-encontrar.component';
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
    RegistroComponent,
    RegistrarUsuarioComponent,
    RegistrarEntidadComponent,
    AnimalesSimilaresComponent,
    AnimalesComponent,
    ResultadosBusquedaComponent,
    AdoptaBasicoComponent,
    ResultadosAdoptaComponent,
    AdoptaAvanzadoComponent,
    EncontrarBasicoComponent,
    EncontrarAvanzadoComponent,
    ResultadosEncontrarComponent
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
