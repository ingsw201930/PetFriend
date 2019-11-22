import { BrowserModule } from '@angular/platform-browser';
import { NgModule } from '@angular/core';
import { AgmCoreModule } from '@agm/core';

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
import { BusquedaComponent } from './componentes/busqueda/busqueda.component';
import { ResultadosBusquedaComponent } from './componentes/resultados-busqueda/resultados-busqueda.component';

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
    BusquedaComponent,
    ResultadosBusquedaComponent
  ],
  imports: [
    BrowserModule,
    AppRoutingModule,
    FormsModule,
    HttpClientModule,
    AgmCoreModule.forRoot({
      apiKey: 'AIzaSyBjghgOsi0i6FzSnXV7lIBDqp4t0YS0T48'
    })
  ],
  providers: [RestClientService],
  bootstrap: [AppComponent]
})
export class AppModule { }
