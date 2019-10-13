import { async, ComponentFixture, TestBed } from '@angular/core/testing';

import { TiposDePublicacionComponent } from './tipos-de-publicacion.component';

describe('TiposDePublicacionComponent', () => {
  let component: TiposDePublicacionComponent;
  let fixture: ComponentFixture<TiposDePublicacionComponent>;

  beforeEach(async(() => {
    TestBed.configureTestingModule({
      declarations: [ TiposDePublicacionComponent ]
    })
    .compileComponents();
  }));

  beforeEach(() => {
    fixture = TestBed.createComponent(TiposDePublicacionComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
