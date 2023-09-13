# We can install docker in our system in two ways: 
# 1. Installing Docker via Terminal:

## -->1. Open the terminal on your Fedora system.

## --> 2.Update your package manager's cache by running this following command:

#### sudo dnf update




## --> 3.Install the required dependencies by running this  command:
sudo dnf install dnf-plugins-core

## -->4.Add the Docker repository by running the following command:

sudo dnf config-manager --add-repo https://download.docker.com/linux/fedora/docker-ce.repo


## -->5.Install Docker by running the following command:
sudo dnf install docker-ce docker-ce-cli containerd.io



## -->6.Start the Docker service by running the following command:
sudo systemctl start docker

## -->7.Enable Docker to start on system boot:

sudo systemctl enable docker


## -->8.Verify that Docker is installed correctly by running the following command:

sudo docker version


#  2.Installing Docker Desktop (GUI):

##  -->1.Visit the Docker website (https://www.docker.com/products/docker-desktop) and download the Docker Desktop package for Fedora.

## -->2.Once the package is downloaded, open the terminal and navigate to the directory where the package is located.

## -->3.Install the package by running the following command, replacing <package_name> with the actual package name:

sudo dnf install <package_name>.rpm


## --> 4.Start Docker Desktop by searching for it in the application launcher or running the following command:

docker


With this, we can work with Docker on the desktop too.

