insert into category (category) values ('work');
insert into category (category) values ('sleep');

insert into tag (tag) values ('tag');
insert into tag (tag) values ('tag2');

insert into entry (checkin, checkout, category_id) values ('2023-12-10T12:15:50', '2023-12-20T12:15:50', 1);
insert into entry (checkin, checkout, category_id) values ('2023-10-10T12:15:50', '2023-10-20T12:15:50', 2);

insert into entry_tags (entry_id, tag_id) values (1, 1);
insert into entry_tags (entry_id, tag_id) values (2, 2);