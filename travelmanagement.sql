create table admin_sign_up
(
Name varchar(30),
Gender varchar(30),
Date_of_Birth varchar(30),
Email varchar(30),
User_ID varchar(30) unique,
Password varchar(30),
Address varchar(250),
City varchar(30),
Country varchar(30),
Contact_Number varchar(30),
Favourate_Place varchar(50)

)
create table sign_up
(
Name varchar(30),
Gender varchar(30),
Date_of_Birth varchar(30),
Email varchar(30),
User_ID varchar(30) unique,
Password varchar(30),
Address varchar(250),
City varchar(30),
Country varchar(30),
Contact_Number varchar(30),
Favourate_Place varchar(50)

)
create table dubai(
User_ID varchar(30) unique,
Package_No varchar(30),
Person varchar(30),
Airways varchar(30),
Ticket_Type varchar(30),
Hotel varchar(30),
Date_From varchar(30)

)
create table india(
User_ID varchar(30) unique,
Package_No varchar(30),
Person varchar(30),
Airways varchar(30),
Ticket_Type varchar(30),
Hotel varchar(30),
Date_From varchar(30)

)
create table malaysia(
User_ID varchar(30) unique,
Package_No varchar(30),
Person varchar(30),
Airways varchar(30),
Ticket_Type varchar(30),
Hotel varchar(30),
Date_From varchar(30)

)
create table nepal(
User_ID varchar(30) unique,
Package_No varchar(30),
Person varchar(30),
Airways varchar(30),
Ticket_Type varchar(30),
Hotel varchar(30),
Date_From varchar(30)

)
create table singapore(
User_ID varchar(30) unique,
Package_No varchar(30),
Person varchar(30),
Airways varchar(30),
Ticket_Type varchar(30),
Hotel varchar(30),
Date_From varchar(30)

)
create table thailand(
User_ID varchar(30) unique,
Package_No varchar(30),
Person varchar(30),
Airways varchar(30),
Ticket_Type varchar(30),
Hotel varchar(30),
Date_From varchar(30)

)
create table uk(
User_ID varchar(30) unique,
Package_No varchar(30),
Person varchar(30),
Airways varchar(30),
Ticket_Type varchar(30),
Hotel varchar(30),
Date_From varchar(30)

)
create table usa(
User_ID varchar(30) unique,
Package_No varchar(30),
Person varchar(30),
Airways varchar(30),
Ticket_Type varchar(30),
Hotel varchar(30),
Date_From varchar(30)

)


create table bandarban(
User_ID varchar(30) unique,
Package_No varchar(30),
Person varchar(30),
Airways_Type varchar(30),
Bus_Type varchar(30),
Hotel varchar(30),
Date_From varchar(30)
)
create table coxsbazar_st_martin(
User_ID varchar(30) unique,
Package_No varchar(30),
Person varchar(30),
Airways_Type varchar(30),
Bus_Type varchar(30),
Hotel varchar(30),
Date_From varchar(30)
)
create table rangamati(
User_ID varchar(30) unique,
Package_No varchar(30),
Person varchar(30),
Airways_Type varchar(30),
Bus_Type varchar(30),
Hotel varchar(30),
Date_From varchar(30)
)
create table sundarban(
User_ID varchar(30) unique,
Package_No varchar(30),
Person varchar(30),
Airways_Type varchar(30),
Bus_Type varchar(30),
Hotel varchar(30),
Date_From varchar(30)
)
create table sylhet(
User_ID varchar(30) unique,
Package_No varchar(30),
Person varchar(30),
Airways_Type varchar(30),
Bus_Type varchar(30),
Hotel varchar(30),
Date_From varchar(30)
)
create table airticket(

User_ID varchar(100) unique,
Country varchar(100),
Person varchar(100),
Airways varchar(100),
Ticket_Type varchar(100),
Date_From varchar(100)
)

select * from sign_up
select * from admin_sign_up
select * from dubai
select * from india
select * from malaysia
select * from nepal
select * from singapore
select * from thailand
select * from uk
select * from usa
select * from bandarban
select * from coxsbazar_st_martin
select * from rangamati
select * from sundarban
select * from sylhet
select * from airticket