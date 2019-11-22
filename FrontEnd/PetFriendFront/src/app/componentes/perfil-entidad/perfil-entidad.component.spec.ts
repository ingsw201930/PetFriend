import { async, ComponentFixture, TestBed } from '@angular/core/testing';

import { PerfilEntidadComponent } from './perfil-entidad.component';

describe('PerfilEntidadComponent', () => {
  let component: PerfilEntidadComponent;
  let fixture: ComponentFixture<PerfilEntidadComponent>;

  beforeEach(async(() => {
    TestBed.configureTestingModule({
      declarations: [ PerfilEntidadComponent ]
    })
    .compileComponents();
  }));

  beforeEach(() => {
    fixture = TestBed.createComponent(PerfilEntidadComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
