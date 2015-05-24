#Environment setup

In order to install Ruby in your Mac, we are going to use **RVM (Ruby Version Manager)**. Just type the following in a shell to have it installed:

```
gpg --keyserver hkp://keys.gnupg.net --recv-keys 409B6B1796C275462A1703113804BB82D39DC0E3
\curl -sSL https://get.rvm.io | bash -s stable --ruby=2.1.5
```

For troubleshooting your rvm installation, please refer to the official [RVM website](https://rvm.io/)

##Install Rspec

For our TDD session we're going to use **RSpec**, the "official" Ruby testing framework. Just type the following in a shell in order to install RSpec.

```
gem install rspec
```


## IDE
You can use whichever text editor you prefer to code the exercises, although we recommend using [Atom](https://atom.io/) for it's syntax highlighting capabilities. If you're an IntelliJ fan, you can also use the [Ruby plugin](https://www.jetbrains.com/idea/features/ruby_rails.html) for IntelliJ (Enterprise license needed).

# Exercises
You will find the exercises in the *stepN* directories. For each one of the steps, the directory structure is the following:

* a **spec** directory containing the actual tests. You shouldn't modify the code here.
* a **lib** directory containing the implementation that sould make the tests pass. This are the files you need to modify.

In order to run the tests of a given step, just cd to that directory and type `rspec`.

Let's start TDDing!

**NOTE:** You will find many resourceful links in the *Appendix* section that will help you in case you get stuck at some point.

# Appendix

## Getting started
[Try Ruby!](http://tryruby.org/levels/1/challenges/0): entry-level Ruby interactive tutorial

[Ruby in tweenty minutes](https://www.ruby-lang.org/en/documentation/quickstart/)

[Rubymonk](https://rubymonk.com/): interactive Ruby tutorial

## Reference
[www.ruby-lang.org](https://www.ruby-lang.org)

[Ruby Core Reference](http://ruby-doc.org/core-2.2.2/)

[Ruby Standard Library Reference](http://ruby-doc.org/stdlib-2.2.2/)
