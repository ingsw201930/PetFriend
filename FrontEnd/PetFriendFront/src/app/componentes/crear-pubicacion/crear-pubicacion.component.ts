import { Component, OnInit } from '@angular/core';

@Component({
  selector: 'app-crear-pubicacion',
  templateUrl: './crear-pubicacion.component.html',
  styleUrls: ['./crear-pubicacion.component.css']
})
export class CrearPubicacionComponent implements OnInit {
  especie = '';
  title = 'imagen';

  imgURL: any;
  public message: string;

  imageSrc: string;

  url1: any = 'assets/pet.png';
  url2: any = 'assets/pet.png';
  url3: any = 'assets/pet.png';
  url4: any = 'assets/pet.png';

  urls: any[] = [];
  constructor() { }

  ngOnInit() {

  }
  preview(files) {
    const mimeType = files[0].type;
    if (mimeType.match(/image\/*/) == null) {
      console.log('Only images are supported.');
      return;
    }
    const reader = new FileReader();
    reader.readAsDataURL(files[0]);
    // tslint:disable-next-line: variable-name
    reader.onload = (_event) => {
      if (this.url1 === 'assets/pet.png') {
        this.url1 = reader.result;
        console.log(this.url1);
        return;
      }

      if (this.url2 === 'assets/pet.png') {
        this.url2 = reader.result;
        return;
      }
      if (this.url3 === 'assets/pet.png') {
        this.url3 = reader.result;
        return;
      }
      if (this.url4 === 'assets/pet.png') {
        this.url4 = reader.result;
        return;
      }
    };
  }



}
