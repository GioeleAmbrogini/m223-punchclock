insert into category (category) values ('work');
insert into category (category) values ('sleep');

insert into tag (tag) values ('tag');
insert into tag (tag) values ('tag2');

insert into applicationuser (password, username) values ('1234', '1234');
insert into applicationuser (password, username) values ('abcd', 'abcd');

insert into entry (checkin, checkout, applicationuser_id, category_id) values ('2023-12-10T12:15:50', '2023-12-20T12:15:50', 1, 1);
insert into entry (checkin, checkout, applicationuser_id, category_id) values ('2023-10-10T12:15:50', '2023-10-20T12:15:50', 1, 2);
insert into entry (checkin, checkout, applicationuser_id, category_id) values ('2023-05-10T12:15:50', '2023-05-20T12:15:50', 2, 2);


insert into entry_tags (entry_id, tag_id) values (1, 1);
insert into entry_tags (entry_id, tag_id) values (2, 2);
insert into entry_tags (entry_id, tag_id) values (3, 1);