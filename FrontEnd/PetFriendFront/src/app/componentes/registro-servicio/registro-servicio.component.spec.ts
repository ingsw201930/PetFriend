import { async, ComponentFixture, TestBed } from '@angular/core/testing';

import { RegistroServicioComponent } from './registro-servicio.component';

describe('RegistroServicioComponent', () => {
  let component: RegistroServicioComponent;
  let fixture: ComponentFixture<RegistroServicioComponent>;

  beforeEach(async(() => {
    TestBed.configureTestingModule({
      declarations: [ RegistroServicioComponent ]
    })
    .compileComponents();
  }));

  beforeEach(() => {
    fixture = TestBed.createComponent(RegistroServicioComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
