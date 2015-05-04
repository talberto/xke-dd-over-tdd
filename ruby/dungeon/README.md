#Environment setup

In order to install Ruby in your Mac, we are going to use RVM (Ruby Version Manager).

```
gpg --keyserver hkp://keys.gnupg.net --recv-keys 409B6B1796C275462A1703113804BB82D39DC0E3
\curl -sSL https://get.rvm.io | bash -s stable --ruby=2.1.5
```

##Install Rspec

```
gem install rspec
```

##Init your project

```
cd dungeon && rspec --init
```
