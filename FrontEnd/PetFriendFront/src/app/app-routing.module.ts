import { NgModule } from '@angular/core';
import { Routes, RouterModule } from '@angular/router';
import { CrearPubicacionComponent } from './componentes/crear-pubicacion/crear-pubicacion.component';
import { IniciarSesionComponent } from './componentes/iniciar-sesion/iniciar-sesion.component';
import { PantallaPrincipalComponent } from './componentes/pantalla-principal/pantalla-principal.component';
import { PublicacionFinalComponent } from './componentes/publicacion-final/publicacion-final.component';
import { TiposDePublicacionComponent } from './componentes/tipos-de-publicacion/tipos-de-publicacion.component';
import { VistaPreviaComponent } from './componentes/vista-previa/vista-previa.component';


const routes: Routes = [
  { path: 'CrearUnaPublicacion', component: CrearPubicacionComponent },
  { path: 'IniciarSesion', component: IniciarSesionComponent },
  { path: '', component: PantallaPrincipalComponent },
  { path: 'EditarPublicacion', component: PublicacionFinalComponent },
  { path: 'TiposDePublicacion', component: TiposDePublicacionComponent },
  { path: 'PublicacionFinal', component: VistaPreviaComponent },
];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }
