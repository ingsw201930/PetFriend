import { async, ComponentFixture, TestBed } from '@angular/core/testing';

import { AdoptaBasicoComponent } from './adopta-basico.component';

describe('AdoptaBasicoComponent', () => {
  let component: AdoptaBasicoComponent;
  let fixture: ComponentFixture<AdoptaBasicoComponent>;

  beforeEach(async(() => {
    TestBed.configureTestingModule({
      declarations: [ AdoptaBasicoComponent ]
    })
    .compileComponents();
  }));

  beforeEach(() => {
    fixture = TestBed.createComponent(AdoptaBasicoComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
