Vagrant.configure("2") do |config|
  config.vm.box = "bento/ubuntu-18.04"  
  
    config.vm.hostname = "docker"
    config.vm.network "private_network", ip: "192.168.33.10"
    config.vm.provision "shell", path:"docker.sh"
    config.vm.provider "virtualbox" do |vb|
      vb.memory = "2048"
	  vb.cpus = 1
	  vb.name = "mydocker"
    end	
  
end
