import { Injectable } from '@angular/core';

@Injectable({
  providedIn: 'root'
})
//authentication service
export class AuthVarService {
  public token!: string;
  public username!: string;
  constructor() { }
}
