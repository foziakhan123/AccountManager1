import { Component, OnInit } from '@angular/core';
import{UserService} from '../../shared_service/user.service';
import{User} from '../../user';

@Component({
  selector: 'app-listuser',
  templateUrl: './listuser.component.html',
  styleUrls: ['./listuser.component.css']
})
export class ListuserComponent implements OnInit {
	private users:User[];
	
  constructor(private _userService:UserService) { }

  ngOnInit() {
  	this._userService.getUsers().subscribe((users)=>{
  		console.log(users);
  		this.users=users;
  		},(error)=>{
  		console.log(error);
  	})
  
  }
  deleteUser(user){
  this._userService.deleteUser(user.id).subscribe((data)=>{
  	this.users.splice(this.users.indexOf(user),1);
	
	}, (error)=>{
	console.log(error);
	});
	
}
