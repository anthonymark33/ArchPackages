package com.rascarlo.arch.packages.api.pojo;

import android.os.Parcel;
import android.os.Parcelable;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.util.List;

public class Result implements Parcelable {

    @SerializedName("pkgdesc")
    @Expose
    private String pkgdesc;

    @SerializedName("depends")
    @Expose
    private List<String> depends = null;

    @SerializedName("licenses")
    @Expose
    private List<String> licenses = null;

    @SerializedName("last_update")
    @Expose
    private String lastUpdate;

    @SerializedName("build_date")
    @Expose
    private String buildDate;

    @SerializedName("compressed_size")
    @Expose
    private String compressedSize;

    @SerializedName("installed_size")
    @Expose
    private String installedSize;

    @SerializedName("filename")
    @Expose
    private String filename;

    @SerializedName("epoch")
    @Expose
    private String epoch;

    @SerializedName("provides")
    @Expose
    private List<String> provides = null;

    @SerializedName("makedepends")
    @Expose
    private List<String> makedepends = null;

    @SerializedName("checkdepends")
    @Expose
    private List<String> checkdepends = null;

    @SerializedName("repo")
    @Expose
    private String repo;

    @SerializedName("maintainers")
    @Expose
    private List<String> maintainers = null;

    @SerializedName("groups")
    @Expose
    private List<String> groups = null;

    @SerializedName("conflicts")
    @Expose
    private List<String> conflicts = null;

    @SerializedName("packager")
    @Expose
    private String packager;

    @SerializedName("arch")
    @Expose
    private String arch;

    @SerializedName("pkgver")
    @Expose
    private String pkgver;

    @SerializedName("replaces")
    @Expose
    private List<String> replaces = null;

    @SerializedName("pkgname")
    @Expose
    private String pkgname;

    @SerializedName("optdepends")
    @Expose
    private List<String> optdepends = null;

    @SerializedName("url")
    @Expose
    private String url;

    @SerializedName("pkgbase")
    @Expose
    private String pkgbase;

    @SerializedName("pkgrel")
    @Expose
    private String pkgrel;

    @SerializedName("flag_date")
    @Expose
    private String flagDate;

    public String getPkgdesc() {
        return pkgdesc;
    }

    public List<String> getDepends() {
        return depends;
    }

    public List<String> getLicenses() {
        return licenses;
    }

    public String getLastUpdate() {
        return lastUpdate;
    }

    public String getBuildDate() {
        return buildDate;
    }

    public String getCompressedSize() {
        return compressedSize;
    }

    public String getInstalledSize() {
        return installedSize;
    }

    public String getFilename() {
        return filename;
    }

    public String getEpoch() {
        return epoch;
    }

    public List<String> getProvides() {
        return provides;
    }

    public List<String> getMakedepends() {
        return makedepends;
    }

    public List<String> getCheckdepends() {
        return checkdepends;
    }

    public String getRepo() {
        return repo;
    }

    public List<String> getMaintainers() {
        return maintainers;
    }

    public List<String> getGroups() {
        return groups;
    }

    public List<String> getConflicts() {
        return conflicts;
    }

    public String getPackager() {
        return packager;
    }

    public String getArch() {
        return arch;
    }

    public String getPkgver() {
        return pkgver;
    }

    public List<String> getReplaces() {
        return replaces;
    }

    public String getPkgname() {
        return pkgname;
    }

    public List<String> getOptdepends() {
        return optdepends;
    }

    public String getUrl() {
        return url;
    }

    public String getPkgbase() {
        return pkgbase;
    }

    public String getPkgrel() {
        return pkgrel;
    }

    public String getFlagDate() {
        return flagDate;
    }

    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        dest.writeString(this.pkgdesc);
        dest.writeStringList(this.depends);
        dest.writeStringList(this.licenses);
        dest.writeString(this.lastUpdate);
        dest.writeString(this.buildDate);
        dest.writeString(this.compressedSize);
        dest.writeString(this.installedSize);
        dest.writeString(this.filename);
        dest.writeString(this.epoch);
        dest.writeStringList(this.provides);
        dest.writeStringList(this.makedepends);
        dest.writeStringList(this.checkdepends);
        dest.writeString(this.repo);
        dest.writeStringList(this.maintainers);
        dest.writeStringList(this.groups);
        dest.writeStringList(this.conflicts);
        dest.writeString(this.packager);
        dest.writeString(this.arch);
        dest.writeString(this.pkgver);
        dest.writeStringList(this.replaces);
        dest.writeString(this.pkgname);
        dest.writeStringList(this.optdepends);
        dest.writeString(this.url);
        dest.writeString(this.pkgbase);
        dest.writeString(this.pkgrel);
        dest.writeString(this.flagDate);
    }

    public Result() {
    }

    private Result(Parcel in) {
        this.pkgdesc = in.readString();
        this.depends = in.createStringArrayList();
        this.licenses = in.createStringArrayList();
        this.lastUpdate = in.readString();
        this.buildDate = in.readString();
        this.compressedSize = in.readString();
        this.installedSize = in.readString();
        this.filename = in.readString();
        this.epoch = in.readString();
        this.provides = in.createStringArrayList();
        this.makedepends = in.createStringArrayList();
        this.checkdepends = in.createStringArrayList();
        this.repo = in.readString();
        this.maintainers = in.createStringArrayList();
        this.groups = in.createStringArrayList();
        this.conflicts = in.createStringArrayList();
        this.packager = in.readString();
        this.arch = in.readString();
        this.pkgver = in.readString();
        this.replaces = in.createStringArrayList();
        this.pkgname = in.readString();
        this.optdepends = in.createStringArrayList();
        this.url = in.readString();
        this.pkgbase = in.readString();
        this.pkgrel = in.readString();
        this.flagDate = in.readString();
    }

    public static final Creator<Result> CREATOR = new Creator<Result>() {
        @Override
        public Result createFromParcel(Parcel source) {
            return new Result(source);
        }

        @Override
        public Result[] newArray(int size) {
            return new Result[size];
        }
    };
}