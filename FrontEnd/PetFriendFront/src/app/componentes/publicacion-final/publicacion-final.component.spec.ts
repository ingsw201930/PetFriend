import { async, ComponentFixture, TestBed } from '@angular/core/testing';

import { PublicacionFinalComponent } from './publicacion-final.component';

describe('PublicacionFinalComponent', () => {
  let component: PublicacionFinalComponent;
  let fixture: ComponentFixture<PublicacionFinalComponent>;

  beforeEach(async(() => {
    TestBed.configureTestingModule({
      declarations: [ PublicacionFinalComponent ]
    })
    .compileComponents();
  }));

  beforeEach(() => {
    fixture = TestBed.createComponent(PublicacionFinalComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
