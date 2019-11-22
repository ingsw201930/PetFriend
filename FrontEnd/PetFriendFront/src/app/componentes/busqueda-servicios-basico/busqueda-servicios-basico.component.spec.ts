import { async, ComponentFixture, TestBed } from '@angular/core/testing';

import { BusquedaServiciosBasicoComponent } from './busqueda-servicios-basico.component';

describe('BusquedaServiciosBasicoComponent', () => {
  let component: BusquedaServiciosBasicoComponent;
  let fixture: ComponentFixture<BusquedaServiciosBasicoComponent>;

  beforeEach(async(() => {
    TestBed.configureTestingModule({
      declarations: [ BusquedaServiciosBasicoComponent ]
    })
    .compileComponents();
  }));

  beforeEach(() => {
    fixture = TestBed.createComponent(BusquedaServiciosBasicoComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
