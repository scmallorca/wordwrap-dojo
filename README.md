WordWrap Dojo
=========================

This [kata](http://codingdojo.org/kata/WordWrap/) is from Robert Martin and his blog includes a [solution in Java](http://thecleancoder.blogspot.com/2010/10/craftsman-62-dark-path.html).

## Instructions

You write a *class* called *Wrapper*, that has a *single static function* named *wrap* that takes *two arguments*, a *string*, and a column *number*. The function *returns the string*, but *with line breaks* inserted at just the right places to make sure that *no line is longer than the column number*. You try to *break lines at word boundaries*.

Like a word processor, break the line by replacing the last space in a line with a newline.

## Solutions
Please, perform a pull request over this repository to add your team solution:
* Fork the repository to your github account.
* Clone the forked repository:
```
$ git clone https://github.com/your_username/wordwrap-dojo.git
```
* Access the repository
```
$ cd wordwrap-dojo
```
* Create a new branch and move to it:
```
$ git checkout -b team_name-branch
```
* Create a folder like "nameA-nameB" or just "nameA" if you are a solo developer in the root of this repository and add your solution:
```
$ mkdir team_name_java
$ cp -r ../MyKata ./team_name_java
```
* Add changes to git and commit
```
$ git add -A
$ git commit -m "Added team_name solution in java"
```
* Push your changes to your remote repository
```
$ git push --set-upstream origin team_name-branch
```
* Create a pull-request from your forked and updated repository on github:
* Select as "base fork" the "scmallorca/wordwrap-dojo" master branch
* Select as "head fork" your "your_name/wordwrap-dojo" team_name branch
