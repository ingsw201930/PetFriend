import { async, ComponentFixture, TestBed } from '@angular/core/testing';

import { PerfilPropioPublicacionesComponent } from './perfil-propio-publicaciones.component';

describe('PerfilPropioPublicacionesComponent', () => {
  let component: PerfilPropioPublicacionesComponent;
  let fixture: ComponentFixture<PerfilPropioPublicacionesComponent>;

  beforeEach(async(() => {
    TestBed.configureTestingModule({
      declarations: [ PerfilPropioPublicacionesComponent ]
    })
    .compileComponents();
  }));

  beforeEach(() => {
    fixture = TestBed.createComponent(PerfilPropioPublicacionesComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
