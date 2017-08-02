package tv;

public class TV {
	
	private int channel;
	private int volume;
	private boolean power;
	
	public TV(int channel, int volume, boolean power) {
		this.channel = channel;
		this.volume = volume;
		this.power = power;
	}
	
	public int getChannel() {
		return channel;
	}

	public int getVolume() {
		return volume;
	}

	public void power(boolean power) {
		this.power = power;
		
		String outPut = "";
		
		System.out.println(power? "TV on!" : "TV off!" );
	}
	
	public boolean isPower() {
		return power;
	}
	
	public void channel(int channel){
		if (channel >= 1 && channel <= 255) {
			this.channel = channel;
		}
	}
	
	public void channel(boolean state) {
		if (state) {
			if (this.channel > 255) {
				this.channel = 1;
			}else{
				this.channel++;
			}
		}else{
			if (this.channel < 1) {
				this.channel = 255;
			}else{
				this.channel--;
			}
		}
	}

	public void volume(int volume){
		if (volume >= 1 && volume <= 100) {
			this.volume = volume;
		}
	}

	public void volume(boolean state) {
		if (state) {
			if (this.volume > 100) {
				this.volume = 1;
			}else{
				this.volume++;
			}
		}else{
			if (this.volume < 1) {
				this.volume = 100;
			}else{
				this.volume--;
			}
		}
	}

	public void status() {
		if (!power) {
			System.out.println("TV의 전원이 꺼져있습니다.");
		}else {
			System.out.println("현재 TV의 상태는 상태는 " + isPower() + ", 채널은 " + getChannel() + ", 볼륨은 " + getVolume() + "입니다.");
		}
	}
}