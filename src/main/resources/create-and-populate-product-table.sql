drop table if exists product;

create table product (
	id varchar(255) not null,
	name varchar(255) not null,
	description varchar(255) not null,
	price float not null,
	primary key (id)
);

insert into product (id,name,description,price) values('PR1...210','BlackBerry 8100 Pearl','Test1',124.60);
insert into product (id,name,description,price) values('PR1...211','Sony Ericsson W810i','Test1',139.45);
insert into product (id,name,description,price) values('PR1...212','Samsung MM-A900M Ace','Test1',97.80);
insert into product (id,name,description,price) values('PR1...213','Toshiba M285-E 14','Test1',166.20);
insert into product (id,name,description,price) values('PR1...214','Nokia 2610 Phone','Test1',145.50);
insert into product (id,name,description,price) values('PR1...215','CN Clogs Beach/Garden Clog','Test1',190.70);
insert into product (id,name,description,price) values('PR1...216','AT&T 8525 PDA','Test1',289.20);
insert into product (id,name,description,price) values('PR1...217','Canon Digital Rebel XT 8MP Digital SLR Camera','Test1',13.70);
insert into product (id,name,description,price) values('PR2...310','Kindle Fire','Test1',199.00);
insert into product (id,name,description,price) values('PR2...311','Apple TV MD199LL/A','Test1',94.86);
insert into product (id,name,description,price) values('PR2...312','Medialink Wireless N Router','Test1',49.99);
insert into product (id,name,description,price) values('PR2...313','Garmin nuvi 1450LMT','Test1',147.44);
insert into product (id,name,description,price) values('PR2...314','Roku 2 XS 1080p Streaming Player','Test1',99.00);
insert into product (id,name,description,price) values('PR2...315','Sony BDP-S590 3D Blu-ray Disk Player','Test1',86.99);
insert into product (id,name,description,price) values('PR2...316','GoPro HD HERO2','Test1',241.14);
insert into product (id,name,description,price) values('PR2...317','Toshiba 32C120U 32-Inch LCD HDTV','Test1',239.99);