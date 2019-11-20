import { async, ComponentFixture, TestBed } from '@angular/core/testing';

import { BusquedaServiciosAvanzadoComponent } from './busqueda-servicios-avanzado.component';

describe('BusquedaServiciosAvanzadoComponent', () => {
  let component: BusquedaServiciosAvanzadoComponent;
  let fixture: ComponentFixture<BusquedaServiciosAvanzadoComponent>;

  beforeEach(async(() => {
    TestBed.configureTestingModule({
      declarations: [ BusquedaServiciosAvanzadoComponent ]
    })
    .compileComponents();
  }));

  beforeEach(() => {
    fixture = TestBed.createComponent(BusquedaServiciosAvanzadoComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
