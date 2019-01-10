create or replace procedure get_sum (first_num in int, second_num in int, result out  int)
as
begin result := first_num + second_num;
end
