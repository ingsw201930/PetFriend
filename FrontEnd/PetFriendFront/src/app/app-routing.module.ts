import { NgModule } from '@angular/core';
import { Routes, RouterModule } from '@angular/router';
import { CrearPubicacionComponent } from './componentes/crear-pubicacion/crear-pubicacion.component';
import { IniciarSesionComponent } from './componentes/iniciar-sesion/iniciar-sesion.component';
import { PantallaPrincipalComponent } from './componentes/pantalla-principal/pantalla-principal.component';
import { PublicacionFinalComponent } from './componentes/publicacion-final/publicacion-final.component';
import { TiposDePublicacionComponent } from './componentes/tipos-de-publicacion/tipos-de-publicacion.component';
import { VistaPreviaComponent } from './componentes/vista-previa/vista-previa.component';
import { NotFoundComponent } from './componentes/not-found/not-found.component';

import {AnimalesComponent} from './componentes/animales/animales.component';
import {AnimalesSimilaresComponent} from './componentes/animales-similares/animales-similares.component';
import {RegistrarEntidadComponent} from './componentes/registrar-entidad/registrar-entidad.component';
import {RegistrarUsuarioComponent} from './componentes/registrar-usuario/registrar-usuario.component';
import {RegistroComponent} from './componentes/registro/registro.component';
import {ResultadosBusquedaComponent} from './componentes/resultados-busqueda/resultados-busqueda.component';
import {AdoptaAvanzadoComponent} from './componentes/adopta-avanzado/adopta-avanzado.component';
import {AdoptaBasicoComponent} from './componentes/adopta-basico/adopta-basico.component';
import {EncontrarAvanzadoComponent} from './componentes/encontrar-avanzado/encontrar-avanzado.component';
import {EncontrarBasicoComponent} from './componentes/encontrar-basico/encontrar-basico.component';
import {ResultadosAdoptaComponent} from './componentes/resultados-adopta/resultados-adopta.component';
import {ResultadosEncontrarComponent} from './componentes/resultados-encontrar/resultados-encontrar.component';
import { ReportesComponent } from './componentes/reportes/reportes.component';

import { PerfilPropioComponent } from './componentes/perfil-propio/perfil-propio.component';
import { PerfilPropioChatsComponent } from './componentes/perfil-propio-chats/perfil-propio-chats.component';
import { PerfilPropioPublicacionesComponent } from './componentes/perfil-propio-publicaciones/perfil-propio-publicaciones.component';
import { PerfilEntidadComponent } from './componentes/perfil-entidad/perfil-entidad.component';
import { BusquedaServiciosAvanzadoComponent } from './componentes/busqueda-servicios-avanzado/busqueda-servicios-avanzado.component';
import { PerfilPropioPublicacionesVacioComponent } from './componentes/perfil-propio-publicaciones-vacio/perfil-propio-publicaciones-vacio.component';
import { ResultadosServiciosComponent } from './componentes/resultados-servicios/resultados-servicios.component';
import { BusquedaServiciosBasicoComponent } from './componentes/busqueda-servicios-basico/busqueda-servicios-basico.component';
import { BuscarServicioComponent } from './componentes/buscar-servicio/buscar-servicio.component';


const routes: Routes = [
  { path: 'CrearUnaPublicacion', component: CrearPubicacionComponent },
  { path: 'IniciarSesion', component: IniciarSesionComponent },
  { path: '', component: PantallaPrincipalComponent },
  { path: 'BuscarServicio', component: BuscarServicioComponent },
  { path: 'PublicacionFinal', component: PublicacionFinalComponent },
  { path: 'TiposDePublicacion', component: TiposDePublicacionComponent },
  { path: 'VistaPrevia', component: VistaPreviaComponent },

  { path: 'Animales', component: AnimalesComponent },
  { path: 'AnimalesSimilares', component: AnimalesSimilaresComponent },
  { path: 'RegistrarEntidad', component: RegistrarEntidadComponent },
  { path: 'RegistrarUsuario', component: RegistrarUsuarioComponent },
  { path: 'Registro', component: RegistroComponent },
  { path: 'ResultadosBusqueda', component: ResultadosBusquedaComponent },
  { path: 'AdoptaAvanzado', component: AdoptaAvanzadoComponent },
  { path: 'AdoptaBasico', component: AdoptaBasicoComponent },
  { path: 'EncontrarAvanzado', component: EncontrarAvanzadoComponent },
  { path: 'EncontrarBasico', component: EncontrarBasicoComponent },
  { path: 'ResultadosAdopta', component: ResultadosAdoptaComponent },
  { path: 'ResultadosEncontrar', component: ResultadosEncontrarComponent },
  { path: 'Reportes', component: ReportesComponent },
  { path: 'Perfil-Usuario', component: PerfilPropioComponent },
  { path: 'Perfil-Chats', component: PerfilPropioChatsComponent },
  { path: 'Perfil-Publicaciones', component: PerfilPropioPublicacionesComponent},
  { path: 'Perfil-Publicaciones-Vacio', component: PerfilPropioPublicacionesVacioComponent},
  { path: 'Perfil-Entidad', component: PerfilEntidadComponent },
  { path: 'Busqueda-Servicios-Basico', component:  BusquedaServiciosBasicoComponent  },
  { path: 'Busqueda-Servicios-Avanzado', component:  BusquedaServiciosAvanzadoComponent  },
  { path: 'Resultados-Servicios', component:  ResultadosServiciosComponent  },
  { path: '**', component: NotFoundComponent },
];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }
