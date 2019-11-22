import { async, ComponentFixture, TestBed } from '@angular/core/testing';

import { RegistrarEntidadComponent } from './registrar-entidad.component';

describe('RegistrarEntidadComponent', () => {
  let component: RegistrarEntidadComponent;
  let fixture: ComponentFixture<RegistrarEntidadComponent>;

  beforeEach(async(() => {
    TestBed.configureTestingModule({
      declarations: [ RegistrarEntidadComponent ]
    })
    .compileComponents();
  }));

  beforeEach(() => {
    fixture = TestBed.createComponent(RegistrarEntidadComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
