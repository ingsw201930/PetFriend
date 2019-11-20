import { NgModule } from '@angular/core';
import { Routes, RouterModule } from '@angular/router';
import { CrearPubicacionComponent } from './componentes/crear-pubicacion/crear-pubicacion.component';
import { IniciarSesionComponent } from './componentes/iniciar-sesion/iniciar-sesion.component';
import { PantallaPrincipalComponent } from './componentes/pantalla-principal/pantalla-principal.component';
import { PublicacionFinalComponent } from './componentes/publicacion-final/publicacion-final.component';
import { TiposDePublicacionComponent } from './componentes/tipos-de-publicacion/tipos-de-publicacion.component';
import { VistaPreviaComponent } from './componentes/vista-previa/vista-previa.component';
import { NotFoundComponent } from './componentes/not-found/not-found.component';
import { PerfilPropioComponent } from './componentes/perfil-propio/perfil-propio.component';
import { PerfilPropioChatsComponent } from './componentes/perfil-propio-chats/perfil-propio-chats.component';
import { PerfilPropioPublicacionesComponent } from './componentes/perfil-propio-publicaciones/perfil-propio-publicaciones.component';
import { PerfilEntidadComponent } from './componentes/perfil-entidad/perfil-entidad.component';

const routes: Routes = [
  { path: 'CrearUnaPublicacion', component: CrearPubicacionComponent },
  { path: 'IniciarSesion', component: IniciarSesionComponent },
  { path: '', component: PantallaPrincipalComponent },
  { path: 'PublicacionFinal', component: PublicacionFinalComponent },
  { path: 'TiposDePublicacion', component: TiposDePublicacionComponent },
  { path: 'VistaPrevia', component: VistaPreviaComponent },
  { path: 'Perfil-Usuario', component: PerfilPropioComponent },
  { path: 'Perfil-Chats', component: PerfilPropioChatsComponent },
  { path: 'Perfil-Publicaciones', component: PerfilPropioPublicacionesComponent},
  { path: 'Perfil-Entidad', component: PerfilEntidadComponent },
  { path: '**', component: NotFoundComponent },
];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }
