insert(X, Ys, [X|Ys]).
%insert(X, [Y|Ys], [Y|Zs]) :- insert(X, Ys, Zs).

list_min(M, [], M).
list_min(X, [Z|Xs], M) :- (M is min(M, min(X, Z))), list_min(X, Xs, M).

my_last(X, [X]).
my_last(X, [_|Xs]) :- my_last(X, Xs).

element_at(X, [X|_], 0).
element_at(X, [_|Xs], N) :- K is N - 1, element_at(X, Xs, K).

reverse_list([], []).
reverse_list([], _).
reverse_list([H|Xs], Xr) :- append(New, [H], Xr), reverse_list(Xs, New), !.


palindrome([]).
palindrome([H|Xs]) :- 