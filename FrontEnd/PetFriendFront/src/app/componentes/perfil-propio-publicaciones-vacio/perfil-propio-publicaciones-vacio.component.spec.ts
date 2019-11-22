import { async, ComponentFixture, TestBed } from '@angular/core/testing';

import { PerfilPropioPublicacionesVacioComponent } from './perfil-propio-publicaciones-vacio.component';

describe('PerfilPropioPublicacionesVacioComponent', () => {
  let component: PerfilPropioPublicacionesVacioComponent;
  let fixture: ComponentFixture<PerfilPropioPublicacionesVacioComponent>;

  beforeEach(async(() => {
    TestBed.configureTestingModule({
      declarations: [ PerfilPropioPublicacionesVacioComponent ]
    })
    .compileComponents();
  }));

  beforeEach(() => {
    fixture = TestBed.createComponent(PerfilPropioPublicacionesVacioComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
