# Setup

> [!CAUTION]  
> Please do not create a pull request on the main project or fork it! Your code won't be private!  

The application exercise is configured for Eclipses, IntelliJ and VS Code IDEs, but you are free to use other development environments (or none at all).  
Before you can start programming, you need to prepare the application exercise properly. There are three ways to do this:  

- [GitHub template](#template)
- [Git clone / import](#clone)
- [ZIP export](#zip)

<a name="template"></a>

## GitHub template

> [!TIP]  
> GitHub templates are the quickest way to set up your project.

| Steps                                                                                                                                                                                                                                                                                               | Image                                                               |
|-----------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------|---------------------------------------------------------------------|
| <ul><li> To do this, click `Use this template` and then click `Create a new repository`. </li></ul>                                                                                                                                                                                                 | ![Use this template](/docs/assets/images/template.png)              |
| <ul><li> Then select `Include all branches`. </li><li> Make sure that the `Owner` is your user name, not a group or organisation. </li><li> You can choose any `Repository name` and `Description`. </li><li> Select the `Private` option to create a private repository. </li></ul>                | ![Create new repository](/docs/assets/images/create-repository.png) |
| <ul><li> Once you have created the private repository, you need to give us access to it. </li><li> To do this, click on `Settings`, then on `Collaborators`, and under `Manage access`, select the `Add people` button. </li><li> Enter the provided email addresses in the input field. </li></ul> | ![Access](/docs/assets/images/access.png)                           |
| <ul><li>In your repository, go back to `Code` and click the green `Code` button. </li><li>The easiest way to download the code is via HTTPS. </li><li> To do this, select `HTTPS` and click the copy icon.</li></ul>                                                                                | ![Git clone](/docs/assets/images/git-clone.png)                     |

Once you have prepared your project, there are a few steps you need to take in Git. If you have never used Git before, you will need to [install](https://git-scm.com/downloads) it first.

Then open a console (e.g. `cmd`) that supports Git. If you are unsure, run `git --version`. Then run the following commands:

```bash
git clone https://github.com/[GitHub-Benutzername]/[Repository-Name].git # Insert the link from the HTTPS here
cd [Repository-Name] # Here is the name of your repository, e.g. AEB-application-exercise
git switch dev # Swaps to the branch dev
```

<a name="clone"></a>

## Git clone / import

> [!IMPORTANT]
> This option is more suitable for experts, as you will need to be familiar with Git and the source host.

You can of course also clone the application exercise and push or import it into your own **private** repository. Your code does not need to be hosted on GitHub. You are free to use other providers. You just need to make sure that we have access to your code and that it is private.  

Please work in the `dev` branch to better compare your changes.  

<a name="zip"></a>

## ZIP export

| Steps                                                                                                                                                                                                                                                                                                                                                          | Image                                                 |
|----------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------|-------------------------------------------------------|
| <ul><li> If you don't want to create a GitHub account, you can download the application exercise as a ZIP file from GitHub. </li><li> To do this, click on `Code` and then on `Download ZIP`. </li><li> You can then work on the exercise without Git, e.g. versioning. <br /> However, we recommend that you use Git versioning, at least locally. </li></ul> | ![Download ZIP](/docs/assets/images/download-zip.png) |