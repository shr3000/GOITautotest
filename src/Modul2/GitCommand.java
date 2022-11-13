package Modul2;

public @interface GitCommand {
    /*
Для инициализации репозитория - пишем git init .

Чтобы понять текущее состояние репозитория - пишем git status

Чтобы добавить файл в staging area - пишем git add <имя файла>

Чтобы сделать коммит - пишем git commit -m "<Описание коммита>"

Чтобы посмотреть историю коммитов - пишем git log. Эта команда покажет список коммитов и их хешей.

Чтобы перейти к конкретному коммиту - пишем git checkout <hash>

Чтобы связать удаленный репозиторий с локальным - один раз пишем git remote add origin <адрес репозитория>

Чтобы глянуть  список удаленных репозиториев - пишем git remote --v

Чтобы залить код на удаленный репозиторий - пишем git push origin master

Чтобы подтянуть код с удаленного репозитория - пишем git pull origin master


КАК РАБОТАТЬ С ВЕТКАМИ
git branch - показывает, на какой вы сейчас ветки
git checkout -b <branch_name> - создает новую ветку с именем <branch_name> и переключается на эту ветку
git checkout <branch_name> - переключается на существующую ветку с именем <branch_name>

This is text made in branch A

This text in branch B
     */
}
